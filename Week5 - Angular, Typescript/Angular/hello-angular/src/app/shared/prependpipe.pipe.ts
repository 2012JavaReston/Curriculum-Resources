import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'prependpipe'
})
export class PrependpipePipe implements PipeTransform {

  //custom pipe by me, that prepends something
  transform(param1: string, param2: string){

    /**
     * We can do some really fancy logic here 
     * but I don't have much of an imagination 
     * So I'll be prepending "Planet to the beginning of the word"
     * 
     * basic stuff: 
     *    setting it to lowercase.
     *    chaging the date format 
     *    
     */
    return param2.concat(param1);
  }

}
