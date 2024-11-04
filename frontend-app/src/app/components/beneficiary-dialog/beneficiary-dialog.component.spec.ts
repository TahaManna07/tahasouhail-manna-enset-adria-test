import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BeneficiaryDialogComponent } from './beneficiary-dialog.component';

describe('BeneficiaryDialogComponent', () => {
  let component: BeneficiaryDialogComponent;
  let fixture: ComponentFixture<BeneficiaryDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BeneficiaryDialogComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BeneficiaryDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
