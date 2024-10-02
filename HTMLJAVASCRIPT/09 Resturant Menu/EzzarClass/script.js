const menu = [
    {
      id: 1,
      title: "Sate Padang",
      price: 10000,
      img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8zh3KoGJ6phCkhK3lnD6Es8HPV3r_iUUYUh2Nj3WxvYsgnjkQrS1PCP0t-9QoMsUSipc&usqp=CAU",
      desc: "Lorem ipsum dolor sit amet huahauha fufufafa samsul skskskkekekns ",
    },
    {
        id: 2,
        title: "Sate Madura",
        price: 10000,
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8zh3KoGJ6phCkhK3lnD6Es8HPV3r_iUUYUh2Nj3WxvYsgnjkQrS1PCP0t-9QoMsUSipc&usqp=CAU",
        desc: "ini penjelasan sate maduraosososo ",
      },
      {
        id: 3,
        title: "Nasi Padang",
        price: 10000,
        img: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8zh3KoGJ6phCkhK3lnD6Es8HPV3r_iUUYUh2Nj3WxvYsgnjkQrS1PCP0t-9QoMsUSipc&usqp=CAU",
        desc: "ini penjelasan nasi padangangangna ",
      }
]



 // get parent element
 const sectionCenter = document.querySelector(".section-center");
 const btnContainer = document.querySelector(".btn-container");
 // display all items when page loads
 window.addEventListener("DOMContentLoaded", function () {
   diplayMenuItems(menu);
   displayMenuButtons();
 });