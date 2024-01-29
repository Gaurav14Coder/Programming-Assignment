
// Program to check if the given number is Prime

function primenumber( num){
let isPrime = true;

if (num > 1) {
    for (let i = 2; i < num; i++) {
        if (num % i == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        console.log(` prime number`);
    } else {
        console.log(` not a prime number`);
    }
}
else {
    console.log("not a prime number");
}
}
primenumber(11);


// Program to check if a vowel is present in the string

function numberOfVowels(string){
    let count = 0;
    string = string.toLowerCase();
    for (let i = 0; i < string.length; i++) {
        if ('aeiou'.includes(string[i])) {
            count++;
        }
    }
    if (count === 0) {
        console.log('No vowels found');
    } else {
        console.log('Total vowels are :' + count);
    }
    }
    
    numberOfVowels("yyyttt");
    


