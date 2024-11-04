import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {BeneficiaryListComponent} from "./components/beneficiary-list/beneficiary-list.component";
import {TransferListComponent} from "./components/transfer-list/transfer-list.component";
import {ConfirmDialogComponent} from "./components/confirm-dialog/confirm-dialog.component";

const routes: Routes = [
  { path: 'beneficiaries', component: BeneficiaryListComponent },
  { path: 'transfers', component: TransferListComponent },
  { path: 'confirm', component: ConfirmDialogComponent },


];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
