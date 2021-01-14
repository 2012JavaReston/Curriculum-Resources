import { Component, OnInit } from '@angular/core';
import { PokemonGeneratorService } from '../pokemon-generator.service';

@Component({
  selector: 'app-poke-page',
  templateUrl: './poke-page.component.html',
  styleUrls: ['./poke-page.component.css']
})
export class PokePageComponent implements OnInit {

  pokeName: string = 'Placeholder ';
  pokeImage: any = 'https://i2.wp.com/ceklog.kindel.com/wp-content/uploads/2013/02/firefox_2018-07-10_07-50-11.png';
  pokeId: number = 0;


  constructor(private pokeGetter: PokemonGeneratorService) { }

  ngOnInit(): void {
  }

  pokeButtonClicked(){
    // console.log('button has been clicked!');

    // this.pokeName = this.pokeGetter.sayHello();
    this.pokeImage = '';

    /**
     * At this point we would like to grab the poke object here
     * 
     * We should be getting a service to get us the object. 
     * 
     * I donn't want my component to also be responsbile for communication
     */
    
     //When the user clicks the button, we need to set the new Url
     this.pokeGetter.setUrl(this.pokeId);

     //Our capture Pokemon method returns an Observable onject
     //Our objservable object as a method called subscrib()
     //When we subscribe, we're effectively getting the observable to send of a request!
     this.pokeGetter.capturePokemon().subscribe(

      (data) => {
        console.log(data);
        const ourField1: any = 'name';
        const ourField2: any = 'sprites';
          const ourField2nested: any = 'front_default';
        
        this.pokeName = data[ourField1];

        let myPoke: object = JSON.parse(data);

        console.log(myPoke);

        let tempArray; //need to create a temporary array 
        tempArray = data[ourField2];
        
        this.pokeImage = tempArray[ourField2nested];



        

      }

     )

  }

  betterPokeButtonClicked(){
    this.pokeGetter.setUrl(this.pokeId);

    this.pokeGetter.actuallyCapturePokemon().subscribe(
      (data) => {
        console.log(data);

        
      
        const ourField: string = 'front_default';
        this.pokeName = data.name;
        this.pokeImage = data.sprites[ourField];
      }
    )
  }
}
