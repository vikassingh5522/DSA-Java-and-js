

const arr = [ 1, 2, 3, 4, 5,6 ];

const result = arr 
          .filter((value, index) => index % 2 == 0) // even no 
          .map(num =>num * num)
        //   .reduce((total ,num) => total + num , 0);
          console.log(result);

