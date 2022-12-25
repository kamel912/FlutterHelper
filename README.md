# Flutter Helper Plugin for IntelliJ and Android Studio

![snapshot](https://raw.githubusercontent.com/kamel912/FlutterHelper/master/assets/snapshot.png)

## - Introduction

[Flutter Helper](https://plugins.jetbrains.com/plugin/19484-flutter-helper) plugin for [IntelliJ](https://www.jetbrains.com/idea/) and [Android Studio](https://developer.android.com/studio/) with support for the [Bloc](https://bloclibrary.dev), [Equatable](https://github.com/felangel/equatable) and [Freezed](https://pub.dev/packages/freezed)  libraries for creating Blocs, Cubits and Service/Repository interfaces  for [Flutter](https://flutter.dev/) apps.

## - Installation

You can find the plugin in the official IntelliJ and Android Studio marketplace:


- [Flutter Helper](https://plugins.jetbrains.com/plugin/19484-flutter-helper)

## - How to use

Right-click on the desired directory Project view, go to `New -> Flutter Generators -> Bloc`, give it a name, select other options, and click on `OK` to see all the boilerplate generated.

[//]: # (### Quick code action)

[//]: # ()
[//]: # (Wrapping a widget is also possible with `Alt + ENTER` shortcut.)

[//]: # (If you wish to disable this quick code action `&#40;Bloc&#41; Wrap with` you can do it so by going to)

[//]: # (`Settings - Editor - Intentions - Bloc`.)

[//]: # ()
[//]: # (![intention_settings]&#40;https://github.com/felangel/bloc/raw/master/extensions/intellij/assets/intention_settings.png&#41;)

[//]: # (### Equatable props generator)

[//]: # ()
[//]: # (Right click and use `Generate -> Equatable Props` to automatically generate the `props` override when using `Equatable`.)

[//]: # ()
[//]: # (![equatable_props_override]&#40;https://github.com/felangel/bloc/raw/master/extensions/intellij/assets/equatable_props_override.png&#41;)

[//]: # ()
[//]: # (## Snippets)

[//]: # ()
[//]: # (### Bloc)

[//]: # ()
[//]: # (| Shortcut            | Description                                     |)

[//]: # (| ------------------- | ----------------------------------------------- |)

[//]: # (| `importbloc`        | Imports `package:bloc`                          |)

[//]: # (| `importflutterbloc` | Imports `package:flutter_bloc`                  |)

[//]: # (| `importbloctest`    | Imports `package:bloc_test`                     |)

[//]: # (| `bloc`              | Creates a bloc class                            |)

[//]: # (| `cubit`             | Creates a cubit class                           |)

[//]: # (| `blocobserver`      | Creates a `BlocObserver` class                  |)

[//]: # (| `blocprovider`      | Creates a `BlocProvider` widget                 |)

[//]: # (| `multiblocprovider` | Creates a `MultiBlocProvider` widget            |)

[//]: # (| `repoprovider`      | Creates a `RepositoryProvider` widget           |)

[//]: # (| `multirepoprovider` | Creates a `MultiRepositoryProvider` widget      |)

[//]: # (| `blocbuilder`       | Creates a `BlocBuilder` widget                  |)

[//]: # (| `bloclistener`      | Creates a `BlocListener` widget                 |)

[//]: # (| `multibloclistener` | Creates a `MultiBlocListener` widget            |)

[//]: # (| `blocconsumer`      | Creates a `BlocConsumer` widget                 |)

[//]: # (| `blocof`            | Shortcut for `BlocProvider.of&#40;&#41;`                |)

[//]: # (| `repoof`            | Shortcut for `RepositoryProvider.of&#40;&#41;`          |)

[//]: # (| `read`              | Shortcut for `context.read&#40;&#41;`                   |)

[//]: # (| `watch`             | Shortcut for `context.watch&#40;&#41;`                  |)

[//]: # (| `select`            | Shortcut for `context.select&#40;&#41;`                 |)

[//]: # (| `blocstate`         | Creates a state class                           |)

[//]: # (| `blocevent`         | Creates an event class                          |)

[//]: # (| `bloctest`          | Creates a `blocTest` with build, act and expect |)

[//]: # (| `mockbloc`          | Creates a class extenting `MockBloc`            |)

[//]: # (| `mockcubit`         | Creates a class extending `MockCubit`           |)

[//]: # (| `fake`              | Creates a class extending `Fake`                |)

[//]: # ()
[//]: # (### Freezed Bloc)

[//]: # ()
[//]: # (| Shortcut     | Description                                        |)

[//]: # (| ------------ | -------------------------------------------------- |)

[//]: # (| `feventwhen` | Creates an event handler with freeze.when function |)

[//]: # (| `feventmap`  | Creates an event handler with freeze.map function  |)

[//]: # (| `fstate`     | Creates a sub state                                |)

[//]: # (| `fevent`     | Creates a sub event                                |)


## - Deployment

Using [Plugin Repository](http://www.jetbrains.org/intellij/sdk/docs/plugin_repository/index.html)
