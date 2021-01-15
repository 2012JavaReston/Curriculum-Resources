import { TestBed } from '@angular/core/testing';

import { BehaviourService } from './behaviour.service';

describe('BehaviourService', () => {
  let service: BehaviourService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BehaviourService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
