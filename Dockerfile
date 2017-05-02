# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM java:8

ADD target\ EjercicioRest.war
EXPOSE 8080
ENTRYPOINT ["java","-war","\EjercicioRest.war"]
CMD ["/bin/sh"]
