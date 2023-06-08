import { Component, OnInit, OnDestroy, EventEmitter, Output } from '@angular/core';
import { KataForFunService } from '../kata-for-fun.service';
import { Result } from '../model/result';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'})
export class KataForFunComponent implements OnInit, OnDestroy {
   convertedValues: string[] = [];
   convertedValue: string;
   constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {

    this.kataForFunService.convertNumber(inputNumber)
    .subscribe(
      (response: Result)=> {
        this.convertedValue= response.result;
        console.log('response '+ response);
        console.log('response.result '+ response.result);
        console.log('this.convertedValue '+ this.convertedValue);
        this.convertedValues.push(inputNumber+" and the result is "+this.convertedValue);
      },
      (error) => {
        console.error('Error:', error);
      }
    );  }

}
interface NumberConverted {
  numberToConvert: number;
  result: string;
}
