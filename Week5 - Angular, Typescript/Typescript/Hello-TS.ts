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

