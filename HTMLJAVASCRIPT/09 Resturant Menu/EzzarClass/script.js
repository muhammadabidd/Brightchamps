menu = [
    {
        id: 1,
        title: "burger",
        price:50000,
        img: "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"

    },
   { 

    id: 2,
    title: "kentang goreng",
    price:40000,
    img: "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"


},
{
    id: 3,
    title: "ayam goreng",
    price:35000,
    img: "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css"

}
]

// get parent element
const sectionCenter = document.querySelector(".section-center")
const btncontainer = document.querySelector(".btn-container")
window.addEventListener("DOMContentLoaded",function (){
    diplayMenuItems(menu);
    // displaymenubutton();
});


function diplayMenuItems(menuItems) {
    console.log("ASDLJKAHSDKJSHD")
    let displayMenu = menuItems.map(function (item) {
      return `<article class="menu-item">
            <img src=${item.img} alt=${item.title} class="photo" />
            <div class="item-info">
              <header>
                <h4>${item.title}</h4>
                <h4 class="price">$${item.price}</h4>
              </header>
              <p class="item-text">
                ${item.desc}
              </p>
            </div>
          </article>`;
    });
   displayMenu = displayMenu.join("");
    sectionCenter.innerHTML = displayMenu;
  }


  function displayMenuButtons() {
    const categories = menu.reduce(
      function (values, item) {
        if (!values.includes(item.category)) {
          values.push(item.category);
        }
        return values;
      },
      ["all"]
    );

    
  //console.log("categ", categories);
  const categoryBtns = categories
  .map(function (category) {
    return `<button type="button" class="filter-btn" data-id=${category}>
        ${category}
      </button>`;
  })
  .join("");
btnContainer.innerHTML = categoryBtns;
const filterBtns = btnContainer.querySelectorAll(".filter-btn");
//console.log(filterBtns;
filterBtns.forEach(function (btn) {
  btn.addEventListener("click", function (e) {
    // console.log("target", e.currentTarget.dataset);
    const category = e.currentTarget.dataset.id;
    const menuCategory = menu.filter(function (menuItem) {
      // console.log(menuItem.category);
      if (menuItem.category === category) {
        return menuItem;
      }
    });  
    if (category === "all") {
      diplayMenuItems(menu);
    } else {
      diplayMenuItems(menuCategory);
    }  
  });
});
}