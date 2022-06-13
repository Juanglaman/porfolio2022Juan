import { TestBed } from '@angular/core/testing';

import { GuardarImagenService } from './guardar-imagen.service';

describe('GuardarImagenService', () => {
  let service: GuardarImagenService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GuardarImagenService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
