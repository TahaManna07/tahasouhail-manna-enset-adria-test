import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private beneficiaryUrl = 'http://localhost:8888/BENEFICIARY-SERVICE/api/beneficiaries';
  private transferUrl = 'http://localhost:8888/VIREMENT-SERVICE/api/virements';

  constructor(private http: HttpClient) {}

  // Bénéficiaires
  getBeneficiaries(): Observable<any[]> {
    return this.http.get<any[]>(this.beneficiaryUrl);
  }

  addBeneficiary(beneficiary: any): Observable<any> {
    return this.http.post<any>(this.beneficiaryUrl, beneficiary);
  }

  deleteBeneficiary(id: number): Observable<void> {
    return this.http.delete<void>(`${this.beneficiaryUrl}/${id}`);
  }

  // Virements
  getTransfers(): Observable<any[]> {
    return this.http.get<any[]>(this.transferUrl);
  }

  addTransfer(transfer: any): Observable<any> {
    return this.http.post<any>(this.transferUrl, transfer);
  }

  deleteTransfer(id: number): Observable<void> {
    return this.http.delete<void>(`${this.transferUrl}/${id}`);
  }
}
