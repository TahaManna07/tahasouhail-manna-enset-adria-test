import { Component, OnInit, ViewChild } from '@angular/core';
import { ApiService } from '../../services/api.service';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatDialog } from '@angular/material/dialog';
import { TransferDialogComponent } from '../transfer-dialog/transfer-dialog.component';

@Component({
  selector: 'app-transfer-list',
  templateUrl: './transfer-list.component.html',
  styleUrls: ['./transfer-list.component.css']
})
export class TransferListComponent implements OnInit {
  displayedColumns: string[] = ['id', 'beneficiaryId', 'ribSource', 'montant', 'description', 'date', 'type', 'actions'];
  dataSource = new MatTableDataSource<any>();

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private apiService: ApiService, public dialog: MatDialog) {}

  ngOnInit(): void {
    this.loadTransfers();
  }

  loadTransfers(): void {
    this.apiService.getTransfers().subscribe(data => {
      this.dataSource.data = data;
      this.dataSource.paginator = this.paginator; // Associer le paginator à la source de données
    });
  }

  deleteTransfer(id: number): void {
    this.apiService.deleteTransfer(id).subscribe(() => {
      this.loadTransfers();
    });
  }

  addTransfer(): void {
    const dialogRef = this.dialog.open(TransferDialogComponent, {
      width: '250px'
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        this.apiService.addTransfer(result).subscribe(() => {
          this.loadTransfers()
        });
      }
    });
  }
  editTransfer(transfer: any): void {
    const dialogRef = this.dialog.open(TransferDialogComponent, {
      width: '400px',
      data: transfer,
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        // Logique de mise à jour du virement
      }
    });
  }
}
