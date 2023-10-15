function mergeSort(arr) {
  if (arr.length <= 1) return arr;

  const mid = Math.floor(arr.length / 2);
  const L = arr.slice(0, mid);
  const R = arr.slice(mid);

  return merge(mergeSort(L), mergeSort(R));
}

function merge(L, R) {
  const result = [];

  let i = 0;
  let j = 0;

  while (i < L.length && j < R.length) {
    if (L[i] > R[j]) {
      result.push(L[i]);
      i++;
    } else {
      result.push(R[j]);
      j++;
    }
  }

  while (i < L.length) {
    result.push(L[i]);
    i++;
  }

  while (j < R.length) {
    result.push(R[j]);
    j++;
  }

  return result;
}

const arr = [1,2,3,4,5,6,7,8,9,10];
const res = mergeSort(arr);
console.log(res);