import { TestBed } from '@angular/core/testing';

import { GuardguardGuard } from './guardguard.guard';

describe('GuardguardGuard', () => {
  let guard: GuardguardGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(GuardguardGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
