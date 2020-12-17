import Vue from "vue";
import VueRouter from "vue-router";
import BestSellerList from "@/views/Home"
import NewReleasesList from "@/views/Home"
import ReadingList from "@/views/MyBooks"
import NewBookForm from "@/views/NewBook"


Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'best-seller-list',
    component: BestSellerList
  },
  {
    path: '/',
    name: 'new-release-list',
    component: NewReleasesList
  },
  {
    path: '/myBooks',
    name: 'reading-list',
    component: ReadingList
  },
  {
    path: '/addBook',
    name: 'new-book-form',
    component: NewBookForm
  }
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
