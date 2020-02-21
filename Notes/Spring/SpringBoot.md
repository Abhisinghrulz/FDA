<h2>SPRING BOOT</h2>

<h3> What Is Inversion of Control?</h3>

Inversion of Control is a principle in software engineering by which the control of objects or portions of a program is transferred to a container or framework. It's most often used in the context of object-oriented programming.

<b>@PostConstruct</b> -> Spring calls methods annotated with @PostConstruct only once, just after the initialization of bean properties. Keep in mind that these methods will run even if there is nothing to initialize.
The method annotated with @PostConstruct can have any access level but it can't be static.
One example usage of @PostConstruct is populating a database. During development, for instance, we might want to create some default users

<b>@PreDestroy</b> ->A method annotated with @PreDestroy runs only once, just before Spring removes our bean from the application context.
Same as with @PostConstruct, the methods annotated with @PreDestroy can have any access level but can't be static.
