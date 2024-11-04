import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { NavbarComponent } from './components/navbar/navbar.component';
import { BeneficiaryListComponent } from './components/beneficiary-list/beneficiary-list.component';
import { TransferListComponent } from './components/transfer-list/transfer-list.component';
import {MatButton, MatButtonModule} from "@angular/material/button";
import {
  MatCell,
  MatCellDef,
  MatColumnDef,
  MatHeaderCell,
  MatHeaderCellDef,
  MatHeaderRow, MatHeaderRowDef, MatRow, MatRowDef,
  MatTable, MatTableModule
} from "@angular/material/table";
import {HttpClientModule} from "@angular/common/http";
import {ConfirmDialogComponent} from "./components/confirm-dialog/confirm-dialog.component";
import {MatIcon, MatIconModule} from "@angular/material/icon";
import { BeneficiaryDialogComponent } from './components/beneficiary-dialog/beneficiary-dialog.component';
import {MatFormField, MatLabel} from "@angular/material/form-field";
import {MatDialogActions, MatDialogClose, MatDialogContent, MatDialogTitle} from "@angular/material/dialog";
import {MatInput} from "@angular/material/input";
import {FormsModule} from "@angular/forms";
import { TransferDialogComponent } from './components/transfer-dialog/transfer-dialog.component';
import {MatPaginator, MatPaginatorModule} from "@angular/material/paginator";

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BeneficiaryListComponent,
    TransferListComponent,
    ConfirmDialogComponent,
    BeneficiaryDialogComponent,
    TransferDialogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatButton,
    MatTable,
    MatHeaderCell,
    MatCell,
    MatHeaderCellDef,
    MatColumnDef,
    MatCellDef,
    MatHeaderRow,
    MatRow,
    HttpClientModule,
    MatHeaderRowDef,
    MatRowDef,
    MatIconModule,
    MatFormField,
    MatDialogContent,
    MatDialogTitle,
    MatInput,
    FormsModule,
    MatDialogActions,
    MatDialogClose,
    MatPaginator

  ],
  providers: [
    provideClientHydration(),
    provideAnimationsAsync()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
