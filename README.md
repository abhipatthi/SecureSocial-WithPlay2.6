# SecureSocial-WithPlay2.6

This is a demo application showing how to use SecureSocial master snapshot. This application has implementation for `github` provider only.

**To run this application**

The most easy way to run this application is to clone the project and import in IntelliJ  IDE as a `sbt` project.
* **Follow this steps**
    * Import as sbt project in IntelliJ
    * Let the IDE build the project for you
    * Register new OAuth application on github [using this link](https://github.com/settings/applications/new)
    * Copy the `Client Id` and `Client Secret` and paste it in securesocial.conf under github
    * Type ``run`` on sbt console
    * open ``http://localhost:9000/`` on a browser