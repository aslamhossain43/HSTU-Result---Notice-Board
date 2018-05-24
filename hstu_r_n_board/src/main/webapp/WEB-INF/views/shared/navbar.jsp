   <%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
   
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${contextRoot}/home">Home</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="#about">About</a>
                    </li>
                    <li><a href="#services">Contact</a>
                    </li>
                    <security:authorize access="hasAuthority('ADMIN')">
                    <li><a href="${contextRoot}/global_manage">Manage</a>
                    </li>
                   </security:authorize>
                </ul>
                
                <ul class="nav navbar-nav navbar-right">
                <!-- by using this after login this part will be vanish -->
                <security:authorize access="isAnonymous()">
                <li id="signup"><a href="${contextRoot}/signup">Sign Up</a></li>
                <li id="login"><a href="${contextRoot}/login">Login</a></li>
              </security:authorize>
               
               <security:authorize access="isAuthenticated()">
               <li class="dropdown">
               <a class="btn btn-default dropdown-toggle" href="javascript:void(0)" data-toggle="dropdown">
               ${registerModel.fullName}<span class="caret"></span>
               
               </a>
               
               <ul class="dropdown-menu">
               <li>
               <a href="${contextRoot}/perform-logout">Logout</a>
               </li>
               
               </ul>
               
              </li>
               
               </security:authorize>
                </ul>
                
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>