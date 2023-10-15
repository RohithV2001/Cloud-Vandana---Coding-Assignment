function reverseString(s) {
    let output = []
    let left = 0
    for (let right = 0; right < s.length; right++) {
        let nextLetter = s[right + 1]
        if (nextLetter === ' ' || nextLetter === undefined) {
            for (let i = right; i >= left; i--) {
                output.push(s[i])
            }
            if (nextLetter === ' ') {
                output.push(' ')
                left = right + 2
            }
        }
    }
    return output.join('')
}
const string = prompt('Enter a string: ');
const result = reverseString(string);
console.log(result);