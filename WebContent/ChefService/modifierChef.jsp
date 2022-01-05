<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zxx">


<!-- Mirrored from demo.dashboardpack.com/user-management-html/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 31 Dec 2021 10:57:24 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Chef Service</title>

    <link rel="icon" href="ChefService/img/mini_logo.png" type="image/png">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="ChefService/css/bootstrap.min.css" />
    <!-- themefy CSS -->
    <link rel="stylesheet" href="ChefService/vendors/themefy_icon/themify-icons.css" />
    <!-- select2 CSS -->
    <link rel="stylesheet" href="ChefService/vendors/niceselect/css/nice-select.css" />
    <!-- owl carousel CSS -->
    <link rel="stylesheet" href="ChefService/vendors/owl_carousel/css/owl.carousel.css" />
    <!-- gijgo css -->
    <link rel="stylesheet" href="ChefService/vendors/gijgo/gijgo.min.css" />
    <!-- font awesome CSS -->
    <link rel="stylesheet" href="ChefService/vendors/font_awesome/css/all.min.css" />
    <link rel="stylesheet" href="ChefService/vendors/tagsinput/tagsinput.css" />

    <!-- date picker -->
     <link rel="stylesheet" href="ChefService/vendors/datepicker/date-picker.css" />

     <link rel="stylesheet" href="ChefService/vendors/vectormap-home/vectormap-2.0.2.css" />
     
     <!-- scrollabe  -->
     <link rel="stylesheet" href="ChefService/vendors/scroll/scrollable.css" />
    <!-- datatable CSS -->
    <link rel="stylesheet" href="ChefService/vendors/datatable/css/jquery.dataTables.min.css" />
    <link rel="stylesheet" href="ChefService/vendors/datatable/css/responsive.dataTables.min.css" />
    <link rel="stylesheet" href="ChefService/vendors/datatable/css/buttons.dataTables.min.css" />
    <!-- text editor css -->
    <link rel="stylesheet" href="ChefService/vendors/text_editor/summernote-bs4.css" />
    <!-- morris css -->
    <link rel="stylesheet" href="ChefService/vendors/morris/morris.css">
    <!-- metarial icon css -->
    <link rel="stylesheet" href="ChefService/vendors/material_icon/material-icons.css" />

    <!-- menu css  -->
    <link rel="stylesheet" href="ChefService/css/metisMenu.css">
    <!-- style CSS -->
    <link rel="stylesheet" href="ChefService/css/style.css" />
    <link rel="stylesheet" href="ChefService/css/colors/default.css" id="colorSkinCSS">
</head>
<body class="crm_body_bg">
    


<!-- main content part here -->
 
 <!-- sidebar  -->
<nav class="sidebar">
    <div class="logo d-flex justify-content-between">
        <a class="large_logo" href="index.html"><img src="ChefService/img/logo.png" alt=""></a>
        <a class="small_logo" href="index.html"><img src="ChefService/img/mini_logo.png" alt=""></a>
        <div class="sidebar_close_icon d-lg-none">
            <i class="ti-close"></i>
        </div>
    </div>
    <ul id="sidebar_menu">
        <li class="">
            <a  href="index.php" aria-expanded="false">
                <div class="nav_icon_small">
                    <img src="ChefService/img/menu-icon/dashboard.svg" alt="">
                </div>
                <div class="nav_title">
                    <span>Accueil</span>
                </div>
            </a>
           
        </li>
        <li class="">
            <a  href="demande.php" aria-expanded="false">
              <div class="nav_icon_small">
                <img src="ChefService/img/menu-icon/11.svg" alt="">
            </div>
            <div class="nav_title">
                <span>Liste Demandes</span>
            </div>
            </a>
           
        </li>
       
      
        <li class="">
            <a   href="chefProjet.php" aria-expanded="false">
              <div class="nav_icon_small">
                <img src="ChefService/img/menu-icon/4.svg" alt="">
            </div>
            <div class="nav_title">
                <span>Chef Projets</span>
            </div>
            </a>
          
        </li>
     
     
        <li class="">
            <a  href="membre.php" aria-expanded="false">
              <div class="nav_icon_small">
                <img src="ChefService/img/menu-icon/5.svg" alt="">
            </div>
            <div class="nav_title">
                <span>Membres</span>
            </div>
            </a>
          
        </li>
       
      
       
      <li class="">
          <a  href="projet.php" aria-expanded="false">
            <div class="nav_icon_small">
                <img src="ChefService/img/menu-icon/21.svg" alt="">
            </div>
            <div class="nav_title">
                <span>Les Projets</span>
            </div>
          </a>
         
        </li>
        <li class="">
            <a  class="has-arrow" href="#" aria-expanded="false">
                <div class="nav_icon_small">
                    <img src="ChefService/img/menu-icon/18.svg" alt="">
                </div>
                <div class="nav_title">
                    <span>Parametre</span>
                </div>
            </a>
            <ul>
                <a href="profile.php">Profile</a>
                <a href="modifier.php">Modifier</a>
                <a href="deconnexion">Deconnexion</a>
              </ul>
          
          </li>
        

       

      </ul>
</nav>
 <!--/ sidebar  -->


<section class="main_content dashboard_part large_header_bg">
        <!-- menu  -->
  <div class="container-fluid no-gutters">
        <div class="row">
            <div class="col-lg-12 p-0 ">
                <div class="header_iner d-flex justify-content-between align-items-center">
                    <div class="sidebar_icon d-lg-none">
                        <i class="ti-menu"></i>
                    </div>
                    <div class="line_icon open_miniSide d-none d-lg-block">
                        <img src="ChefService/img/line_img.png" alt="">
                    </div>
                    <div class="serach_field-area d-flex align-items-center">
                        <div class="search_inner">
                            <form action="#">
                                <div class="search_field">
                                    <input type="text" placeholder="Recherche">
                                </div>
                                <button type="submit"> <img src="ChefService/img/icon/icon_search.svg" alt=""> </button>
                            </form>
                        </div>
                    </div>
                    <div class="header_right d-flex justify-content-between align-items-center">
                        <div class="header_notification_warp d-flex align-items-center">
                            <li>
                                <a class="bell_notification_clicker" href="#"> <img src="ChefService/img/icon/bell.svg" alt="">
                                    <span>2</span>
                                </a>
                                <!-- Menu_NOtification_Wrap  -->
                            <div class="Menu_NOtification_Wrap">
                                <div class="notification_Header">
                                    <h4>Notifications</h4>
                                </div>
                              
                                <div class="nofity_footer">
                                    <div class="submit_button text-center pt_20">
                                        <a href="#" class="btn_1">See More</a>
                                    </div>
                                </div>
                            </div>
                            <!--/ Menu_NOtification_Wrap  -->
                            </li>
                           
                        </div>
                        <div class="profile_info">
                            <img src="ChefService/img/chef.png" alt="#">
                            <div class="profile_info_iner">
                                <div class="profile_author_name">
                                    <p>Chef Service</p>
                                    <h5>${chef.username}</h5>
                                </div>
                                <div class="profile_info_details">
                                    <a href="profile.html">Profile</a>
                                    <a href="modifier.html">Modifier profile</a>
                                    <a href="deconnexion">Deconnexion</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ menu  -->
    <div class="main_content_iner overly_inner ">
        <div class="container-fluid p-0 ">
            <!-- page title  -->
            <div class="row">
                <div class="col-12">
                    <div class="page_title_box d-flex flex-wrap align-items-center justify-content-between">
                        <div class="page_title_left d-flex align-items-center">
                            <h3 class="f_s_25 f_w_700 dark_text mr_30" >Chef Projets</h3>
                            <ol class="breadcrumb page_bradcam mb-0">
                                <li class="breadcrumb-item"><a href="javascript:void(0);">chef Projete</a></li>
                                <li class="breadcrumb-item active">Modifier</li>
                            </ol>
                         
                        </div>
                        <div class="page_title_right">
                            <div class="page_date_button d-flex align-items-center"> 
                                <img src="img/icon/calender_icon.svg" alt="">
                                August 1, 2020 - August 31, 2020
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <div class="white_card card_height_100 mb_30">
                        <div class="white_card_header">
                            <div class="box_header m-0">
                                <div class="main-title">
                                    <h3 class="m-0">Modifier chef Projet </h3>
                                </div>
                            </div>
                        </div>
                        <div class="white_card_body">
                         <form action="updateChef.php" method="post">
                            <div class="row">
                            
                                <div class="col-lg-12">
                                
                                    <div class="common_input mb_15">
                                     <label >Telephone</label>
                                        <input type="number" value="${chefprojet.tel}" name="tel">
                                         <input type="hidden" value="${chefprojet.id}" name="id">
                                         
                                    </div>
                                </div>
                                    <div class="col-lg-6">
                                     <div class="common_input mb_15">
                                      <label >Nom</label>
                                    <input type="text" value="${chefprojet.nom}"  name="nom">
                                      </div>
                                </div>
                               
                              
                                <div class="col-lg-6">
                                    <div class="common_input mb_15">
                                     <label >Prenom</label>
                                         <input type="text" value="${chefprojet.prenom}"  name="prenom">
                                    </div>
                                </div>
                              
                                <div class="col-lg-6">
                                    <div class="common_input mb_15">
                                     <label >Username</label>
                                         <input type="text" value="${chefprojet.username}"  name="user">
                                    </div>
                                </div>
                                 <div class="col-lg-6">
                                    <div class="common_input mb_15">
                                     <label >Password</label>
                                        <input type="password" value="${chefprojet.password}"  name="pass">
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="create_report_btn mt_30">
                                        <button type="submit" class="btn btn-primary  text-center">Modifier</button>
                                        <button type="reset" class="btn btn-danger  text-center">Annuler</button>
                                    </div>
                                </div>
                                
                             
                            </div>
                               </form>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
    </div>

<!-- footer part -->
<div class="footer_part">
    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-12">
                <div class="footer_iner text-center">
                    <p> <a href="#"> <i class=""></i> </a><a href="#"> Prestation Service</a></p>
                </div>
            </div>
        </div>
    </div>
</div>
</section>
<!--/### CHAT_MESSAGE_BOX  ### -->

<div id="back-top" style="display: none;">
    <a title="Go to Top" href="#">
        <i class="ti-angle-up"></i>
    </a>
</div>

 	


<!-- footer  -->
<script src="ChefService/js/jquery-3.4.1.min.js"></script>
<!-- popper js -->
<script src="ChefService/js/popper.min.js"></script>
<!-- bootstarp js -->
<script src="ChefService/js/bootstrap.min.js"></script>
<!-- sidebar menu  -->
<script src="ChefService/js/metisMenu.js"></script>
<!-- waypoints js -->
<script src="ChefService/vendors/count_up/jquery.waypoints.min.js"></script>
<!-- waypoints js -->
<script src="ChefService/vendors/chartlist/Chart.min.js"></script>
<!-- counterup js -->
<script src="ChefService/vendors/count_up/jquery.counterup.min.js"></script>

<!-- nice select -->
<script src="ChefService/vendors/niceselect/js/jquery.nice-select.min.js"></script>
<!-- owl carousel -->
<script src="ChefService/vendors/owl_carousel/js/owl.carousel.min.js"></script>

<!-- responsive table -->
<script src="ChefService/vendors/datatable/js/jquery.dataTables.min.js"></script>
<script src="ChefService/vendors/datatable/js/dataTables.responsive.min.js"></script>
<script src="ChefService/vendors/datatable/js/dataTables.buttons.min.js"></script>
<script src="ChefService/vendors/datatable/js/buttons.flash.min.js"></script>
<script src="ChefService/vendors/datatable/js/jszip.min.js"></script>
<script src="ChefService/vendors/datatable/js/pdfmake.min.js"></script>
<script src="ChefService/vendors/datatable/js/vfs_fonts.js"></script>
<script src="ChefService/vendors/datatable/js/buttons.html5.min.js"></script>
<script src="ChefService/vendors/datatable/js/buttons.print.min.js"></script>

<!-- datepicker  -->
<script src="ChefService/vendors/datepicker/datepicker.js"></script>
<script src="ChefService/vendors/datepicker/datepicker.en.js"></script>
<script src="ChefService/vendors/datepicker/datepicker.custom.js"></script>

<script src="ChefService/js/chart.min.js"></script>
<script src="ChefService/vendors/chartjs/roundedBar.min.js"></script>

<!-- progressbar js -->
<script src="ChefService/vendors/progressbar/jquery.barfiller.js"></script>
<!-- tag input -->
<script src="ChefService/vendors/tagsinput/tagsinput.js"></script>
<!-- text editor js -->
<script src="ChefService/vendors/text_editor/summernote-bs4.js"></script>
<script src="ChefService/vendors/am_chart/amcharts.js"></script>

<!-- scrollabe  -->
<script src="ChefService/vendors/scroll/perfect-scrollbar.min.js"></script>
<script src="ChefService/vendors/scroll/scrollable-custom.js"></script>

<!-- vector map  -->
<script src="ChefService/vendors/vectormap-home/vectormap-2.0.2.min.js"></script>
<script src="ChefService/vendors/vectormap-home/vectormap-world-mill-en.js"></script>

<!-- apex chrat  -->
<script src="ChefService/vendors/apex_chart/apex-chart2.js"></script>
<script src="ChefService/vendors/apex_chart/apex_dashboard.js"></script>

<!-- <script src="ChefService/vendors/echart/echarts.min.js"></script> -->


<script src="ChefService/vendors/chart_am/core.js"></script>
<script src="ChefService/vendors/chart_am/charts.js"></script>
<script src="ChefService/vendors/chart_am/animated.js"></script>
<script src="ChefService/vendors/chart_am/kelly.js"></script>
<script src="ChefService/vendors/chart_am/chart-custom.js"></script>
<!-- custom js -->
<script src="ChefService/js/dashboard_init.js"></script>
<script src="ChefService/js/custom.js"></script>

</body>

<!-- Mirrored from demo.dashboardpack.com/user-management-html/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 31 Dec 2021 10:57:24 GMT -->
</html>
