const loadingButton = document.getElementsByClassName('loadingButton')[0];

loadingButton.onclick = function() {
   fetch('https://techelevator-pgh-teams.azurewebsites.net/api/techelevator/shoppinglist')
        .then((response) => {
            return response.json();
        })
        .then((todos) => {
            const list = document.querySelector("ul");
            todos.forEach((todo) => {
                const tmpl = document.getElementById('shopping-list-item-template').content.cloneNode(true);
                tmpl.querySelector("li").insertAdjacentHTML('afterbegin', todo.name);
                if( todo.completed ) {
                    const circleCheck = tmpl.querySelector('.fa-check-circle');
                    circleCheck.className += " completed";
                  }
                list.appendChild(tmpl);
            });
        })
        .catch((err) => {console.error(err)});
};
