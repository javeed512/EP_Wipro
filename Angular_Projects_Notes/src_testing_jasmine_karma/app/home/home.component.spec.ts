import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeComponent } from './home.component';

describe('HomeComponent', () => {
  let homeComponent: HomeComponent;
  let fixture: ComponentFixture<HomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HomeComponent);
    homeComponent = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(homeComponent).toBeTruthy();
  });

  it("test name data",()=>{

    expect(homeComponent.name).toEqual('javeed');

  });

  it("test salary data",()=>{

    expect(homeComponent.salary).toBeGreaterThan(10000);


  });



});
