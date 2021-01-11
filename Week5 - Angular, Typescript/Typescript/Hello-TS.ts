/**
 * 
 * What is TypeScript?
 *  Typescript was developed for larger application. The syntax is closer to Java and C#
 * 
 * TS is strongly typed, easier to debug, even get synatx errors. 
 * 
 * We can install typescrip from NPM using:
 *      npm install -g typescript
 * 
 * We can transpile TS into JS using:
 * 
 * tsc *filename*.ts
 * 
 * tsc *filenamet*.ts -w <-- watch mode
 * 
 * tsc -t es2015 *filename*.ts
 * 
 * Why transpile than compile?
 *  Trnaspiling is where a language is converted to another similar level of abstraction language. 
 * 
 */


console.log("HEllo TS!");

/**
 * What are the datatypes in Javascript? 
 *      string, number, undefined, null, boolean, symbol, bigInt, object, function
 */

let s1;
s1 = "hello"; //implicilty defined to be a string 
s1 = 3; 

console.log(s1);

//In TS we can declare types 

let s2; //impliclty declaring it to be "any"
let s3: number; //s3 is of type number 
let s4: number|string|boolean;
s3 = 2; 
// s3 = "apples";


s4 = 2;
s4 = "apples"
s4 = true;
console.log(s3);

let v1: null = null;
let v2: void = null;
let v3: null = undefined;
let v4: undefined = null;

//Arrays 
let arr1: number[];
arr1 = [1,2,3,4];
arr1 = [1,2];
// arr1 = [1,"apples"]; //But doe snot like different datatypes in the array, but array is mutable in size. 

let arr2: Array<number>;

//Tupels - immutable datatypes
// fixed size and datatypes have to be in a specific order
let tupl1 : [string,boolean,number];
tupl1 = ['hola',true,3];

//Enum 
// A unique type that has a fixed set of values. 
//An enumeration is a collection of constants, representational values. 

//Below is the JS way 

const OFF = 0;
const IDLE = 1;
const ACCEL = 2;

let myCarStatus = ACCEL;

if(myCarStatus == OFF){
    //executes if the car states is off. 
}



//In TS

enum carStates {OFF =0, IDLE =1, STOPLIGHT = 72, ACCEL = 2, CRUISING= 3}

if(myCarStatus == carStates.ACCEL){
    // car acceleration logic. 
}

//FUNCTIONS

function myFunc(a,b,c){
    //Basically identical to Javascript code
}

function myOtherFunc(a: number, b: string, c: boolean){
    //a bit more TS
}

function finalFunc() : string{
    //here we're specifying the parameter datatypes and the return types. 
    console.log("I'm invoking against TypeScript!")
    return 'hi';
};

interface Moon{
    name: string;
}

interface Planet{
    name: string;
    hasRings: boolean;
    moons: Array<Moon>;
    orbit(): void;
}

let nix: Moon = {
    name: "Nix",
};

let earth: Planet = {
    name: "The Earth",
    hasRings: false,
    moons: [nix],
    orbit: () => console.log("I'm orbiting!")
};

class Star implements Moon{

    /**
     * Accessmodifiers in Typescript:
     *      private, public, protected. 
     */
    public name: string; //this is accessible anywhere 
    nickname: string; //defaults public 
    protected size: number; //accessible internally or to any class that extends it
    private planets: number; //accessible only internally to our class 

    constructor(name: string, nickname: string, size: number, planets: number){
        this.name = name;
        this.nickname = nickname;
        this.size = size;
        this.planets = planets;
    }

    fusion(): void {
        console.log(`${this.name} getting brighter!`);
    }
}

let Sun: Star = new Star("The Sun", "Bright thingy", 1,8);

console.log(Sun.name);
console.log(Sun.nickname);
console.log(Sun.fusion);


class NeutronStar extends Star{

    hasExploded: boolean;

    constructor(name: string, nickname: string, size: number, planets: number){
        // super();
        super(name,nickname,size,planets);
        this.hasExploded = false;
    }

    fusion(): void {
        super.fusion(); //invoking our parent's functionality 

        this.hasExploded = true;
        console.log("explosions in space!");
    }

    spinabout(): void {
        console.log("spinning a lot");
    }

}

let pulsar: NeutronStar = new NeutronStar("Generic Neutron star", "very spinny",3,0); //If we don't define a constructor we get give a parent constructor.

pulsar.fusion();


interface A{};
interface B{};

class Animal implements A,B{

    /**
     * private name: string;
     * 
     * constructor(name){
     *  this.name=name;
     * }
     * 
     * old boring way
     * //////////////////////////////
     * 
     * The following 2 lines of code have the same effect as the above code. 
     * 
     * constructor(private name:string){
     * }
     * 
     */
    

    //Overloading in Typescript
    //TS does not allow multiple constructores, instead we get optinal parameters. 
    //optional parameters, we don't need to add them to our arguments 
    // optional parameters HAVE to be on the RIGHT of the non-optional parameters. 
    constructor( private breed?: string, private age?: number, public name?: string){

        //Why do we add access modifiers? 
        //By adding access modifers to our parameters, we are defining the level of access 
        // and associating it as a property of the object. 

    }

    get Breed(): string{
        console.log("I'm accessing a private variable, the breed through a getter method!")
        return this.breed;
    }

    set Breed(breed: string){
        this.breed=breed;
    }

    
}

// let animal: Animal = new Animal();
// let animal2: Animal = new Animal(2);
// let animal3: Animal = new Animal(2, "Bob");
// let animal4: Animal = new Animal("Bob"); //you've got to go from left to right. 

let puppy: Animal = new Animal("Golder Retriever", 8, "Bubby");

console.log(puppy.Breed); //this is invoking the getter method 

// puppy.Breed("German Shepard"); //this setter does not work 
puppy.Breed = "German Shepard";

console.log(puppy.Breed); //this is invoking the setter method.
