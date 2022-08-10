FROM openjdk:11-jre

COPY target/financial_portfolio_manager.jar financial_portfolio_manager.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/financial_portfolio_manager.jar"]
