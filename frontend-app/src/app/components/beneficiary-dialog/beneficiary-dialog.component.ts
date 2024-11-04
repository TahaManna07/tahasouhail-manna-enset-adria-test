import { Component, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-beneficiary-dialog',
  templateUrl: './beneficiary-dialog.component.html',
  styleUrls: ['./beneficiary-dialog.component.css']
})
export class BeneficiaryDialogComponent {
  constructor(
    public dialogRef: MatDialogRef<BeneficiaryDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any
  ) {}

  onNoClick(): void {
    this.dialogRef.close();
  }
}
