<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Empresas</title>
        <link rel="stylesheet" type="text/css" href="styles/global.css">
        <script src="js/index.js"></script>
    </head>
    <body>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;400;700;800&display=swap" rel="stylesheet">

        <div class="container">

            <div class="left-col">
                <nav>
                    <img src="https://i.postimg.cc/JzKwwG16/arrow.png" class="back-btn">

                    <ul>
                        <li><a href="pages/company/form/formNewCompany.jsp">Cadastro</a></li>
                        <li><a href="pages/company/list/listCompany.jsp">Empresas</a></li>
                    </ul>
                </nav>
            </div>

            <section>
                <header>
                    <svg  class="menu-btn" width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path d="M20 5V2H0V5H20ZM20 11V8H0V11H20ZM20 17V14H0V17H20Z" fill="white"/>
                    </svg>
                    <p class="logo">Logo</p>
                </header>
                <div class="cv">
                    <div class="content">
                        <h1>Mananger Company</h1>
                        <p>Sistema Gerencidor de empresas</p>

                        <a href="pages/company/Form/formNewCompany.jsp" class="cta">Cadastre-se</a>
                    </div>
                </div>
            </section>
        </div>

    </body>
</html>

