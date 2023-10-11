/* Q1. Take a sentence as an input and reverse every word in that sentence.
Example - This is a sunny day > shiT si a ynnus yad. */

// METHOD 1: USING INBUILT FUNCTIONS
function reverseWords(sentence) {
	const words = sentence.split(" ");

	// Reverse each word in the array
	const reversedWords = words.map((word) => {
		// Reverse the characters in each word
		return word.split("").reverse().join("");
	});

	// Join the reversed words back into a sentence
	const reversedSentence = reversedWords.join(" ");

	return reversedSentence;
}

// METHOD 2: WITHOUT USING ANY INBUILT FUNCTIONS

function reverseWordsNative(sentence) {
	let reversedSentence = "";
	let word = "";
	let isWord = false;

	for (let i = 0; i < sentence.length; i++) {
		const char = sentence[i];

		if (char !== " ") {
			// Append characters to the current word
			word = char + word;
			isWord = true;
		} else {
			// If a space is encountered, add the reversed word (if any) and the space
			if (isWord) {
				reversedSentence += word + " ";
				word = "";
				isWord = false;
			} else {
				// If multiple spaces are encountered, just add them to the result
				reversedSentence += char;
			}
		}
	}
	if (isWord) {
		reversedSentence += word;
	}

	return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
const reversedSentenceNative = reverseWordsNative(inputSentence);
console.log(reversedSentence);
console.log(reversedSentenceNative);

//Q2. Perform sorting of an array in descending order.

const numbers = [5, 2, 9, 1, 5, 6];

numbers.sort(function (a, b) {
	return b - a; // Compare in descending order
});

console.log(numbers);
