import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListPartieCommunesComponent } from './list-partie-communes.component';

describe('ListPartieCommunesComponent', () => {
  let component: ListPartieCommunesComponent;
  let fixture: ComponentFixture<ListPartieCommunesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListPartieCommunesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListPartieCommunesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
