import { ComponentFixture, TestBed } from "@angular/core/testing";
import { KataForFunComponent } from "./kata-for-fun.component";
import { HttpClientModule } from '@angular/common/http';
import { KataForFunService } from "../kata-for-fun.service";
import { KataForFunFormComponent } from "../kata-for-fun-form/kata-for-fun-form.component";
import { FormsModule } from "@angular/forms";
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';


describe('KataForFunComponent', () => {
    let component: KataForFunComponent;
    let fixture: ComponentFixture<KataForFunComponent>;
    let httpMock: HttpTestingController;
          
    beforeEach(async () => {
      await TestBed.configureTestingModule({
        declarations: [KataForFunComponent, KataForFunFormComponent],
        imports: [HttpClientModule, FormsModule],
        providers: [
          KataForFunService,
          { provide: 'SERVER_URL', useValue: 'http://localhost:8080/kata-for-fun/' },
          
        ],
      }).compileComponents();
    });

   
    beforeEach(async () => {
      await TestBed.configureTestingModule({
        declarations: [KataForFunComponent, KataForFunFormComponent],
        imports: [FormsModule, HttpClientModule, HttpClientTestingModule],
        providers: [
          KataForFunService,
          { provide: 'SERVER_URL', useValue: 'http://localhost:8080/kata-for-fun/' },
        ],
      }).compileComponents();
    
      fixture = TestBed.createComponent(KataForFunComponent);
      component = fixture.componentInstance;
    });


    afterEach(() => {
      httpMock.verify();
    });
  
    it('should return "1" for input 1', () => {
      component.convertNumber(1);
      expect(component.convertedValue).toBe('1');
    });
  
    it('should return "KataKata" for input 3', () => {
      component.convertNumber(3);
      expect(component.convertedValue).toBe('KataKata');
    });
  
    it('should return "ForFor" for input 5', () => {
        component.convertNumber(5);
        expect(component.convertedValue).toBe('ForFor');
      });

    it('should return "Fun" for input 7', () => {
      component.convertNumber(7);
      expect(component.convertedValue).toBe('Fun');
    });

    it('should return "Kata" for input 9', () => {
        component.convertNumber(9);
        expect(component.convertedValue).toBe('Kata');
      });
    
    it('should return "KataFor" for input 51', () => {
        component.convertNumber(51);
        expect(component.convertedValue).toBe('KataFor');
      }); 

    it('should return "ForKata" for input 53', () => {
        component.convertNumber(53);
        expect(component.convertedValue).toBe('ForKata');
      }); 
    
    it('should return "KataKataKata" for input 33', () => {
        component.convertNumber(33);
        expect(component.convertedValue).toBe('KataKataKata');
      }); 
    
    it('should return "KataFun" for input 27', () => {
        component.convertNumber(27);
        expect(component.convertedValue).toBe('KataFun');
      }); 
    
    it('should return "KataForFor" for input 15', () => {
        component.convertNumber(15);
        expect(component.convertedValue).toBe('KataForFor');
      }); 
  
  });
  