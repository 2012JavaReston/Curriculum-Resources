/**
 * 
 * AJAX - a technique for accessing web servers from a web page asynchronosuly 
 * 
 * synchrnous and asychnronous? 
 *         allows us to still have a functioniong webpage becaus eit does not
 *          block everything wating for a response. 
 * 
 * AJAX consists of :
 *  - browser built -in XMLHTTPRequest object  (request data from the web server)
 *  - Javascript
 *  - DOM (to display or use the data!)
 */

 window.onload = function(){
     document.getElementById("pokemonSubmit").addEventListener('click',getPokemon);
     console.log("setting the listener!")
 };

 function getPokemon(){
    //Getting the pokemon id form the user
    let pokemonId = document.getElementById("pokemonId").value;
    console.log(pokemonId);


    /**
     * How does AJAX work?
     *  1) an event occurs in a wbe page (button isl clicked or poage loaded)
     *  2) An XLHttpRequest object is created by JS
     *  3) XMLHttpRequest object sends a request to a web server
     *  4) Server processes the request
     *  5) Server sends a respoonse back to the web page
     */

     let xhttp = new XMLHttpRequest();

     xhttp.onreadystatechange = function(){
         /**
          * The readystate holds the status of the XMLHttpRequest
          * 0 - request not initalized
          * 1 - server connection established
          * 2 - request received
          * 3 - processing request 
          * 4 - request is finished and response is ready.
          */

          console.log("Changing my readystate " + xhttp.readyState);

          //readystate 4 means that the request and response has been processed
          //status code means that the response was valid. 
          if(xhttp.readyState == 4 && xhttp.status == 200){

                let poke = JSON.parse(xhttp.responseText);
                
              //All the DOM manipulation can start to happen here
              DOMManipulation(poke);

          }else if(xhttp.readyState == 4 && xhttp.status != 200){

              console.log("We need anumbe, not whatever your put down")
          }

     }

     let PokeURL = "https://pokeapi.co/api/v2/pokemon/";
     
     xhttp.open("GET",PokeURL + pokemonId);


     xhttp.send();


 }

function DOMManipulation(pokemon){

    //setting the name
    document.getElementById("pokemonName").innerHTML = pokemon.name;

    //setting the image
    let pokeImg = document.getElementById("pokemonImg");

    // console.log(pokemon)
    pokeImg.setAttribute("src",pokemon.sprites.front_default);
    pokeImg.setAttribute("title", pokemon.name);
}