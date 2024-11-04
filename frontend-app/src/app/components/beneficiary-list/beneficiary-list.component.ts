import { Component, OnInit } from '@angular/core';
import { ApiService } from '../../services/api.service';
import { MatTableDataSource } from '@angular/material/table';
import { MatDialog } from '@angular/material/dialog';
import { BeneficiaryDialogComponent } from '../beneficiary-dialog/beneficiary-dialog.component';

@Component({
  selector: 'app-beneficiary-list',
  templateUrl: './beneficiary-list.component.html',
  styleUrls: ['./beneficiary-list.component.css']
})
export class BeneficiaryListComponent implements OnInit {
  displayedColumns: string[] = ['id', 'nom', 'prenom', 'rib', 'type', 'actions'];
  dataSource = new MatTableDataSource<any>();

  constructor(private apiService: ApiService, public dialog: MatDialog) {}

  ngOnInit(): void {
    this.loadBeneficiaries();
  }

  loadBeneficiaries(): void {
    this.apiService.getBeneficiaries().subscribe(data => {
      this.dataSource.data = data;
    });
  }

  deleteBeneficiary(id: number): void {
    if (confirm('Êtes-vous sûr de vouloir supprimer ce bénéficiaire ?')) {
      this.apiService.deleteBeneficiary(id).subscribe(() => {
        this.loadBeneficiaries();
      });
    }
  }

  addBeneficiary(): void {
    const dialogRef = this.dialog.open(BeneficiaryDialogComponent, {
      width: '400px',
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.apiService.addBeneficiary(result).subscribe(() => {
          this.loadBeneficiaries();
        });
      }
    });
  }

  editBeneficiary(beneficiary: any): void {
    const dialogRef = this.dialog.open(BeneficiaryDialogComponent, {
      width: '400px',
      data: beneficiary,
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        // Logique de mise à jour du bénéficiaire
      }
    });
  }
}
