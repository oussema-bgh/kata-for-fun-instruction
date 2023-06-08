import { Component, EventEmitter, Output } from '@angular/core';



@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html'
})
export class KataForFunFormComponent   {

  inputNumber: number;

  @Output() submitNumberOutput: EventEmitter<number> = new EventEmitter<number>();

  submitNumber(): void {
    this.submitNumberOutput.emit(this.inputNumber);
  }


}
