# Hardcore+ Generator
This Minecraft mod aims to make worlds harder to live in. It runs with the default Vanilla world generator, which makes all new worlds (and existing worlds with new chunks) nearly impossible to live in.

To build this mod, you need to setup the workspace first. Mac and Linux users, use this in a Terminal in the root directory of the project:

`./gradlew decompworkspace`

Windows users need to remove the "./" part.

For Eclipse users, type this in the Terminal in the root directory of the project (Windows users must remove the "./" part):

`./gradlew eclipse`

For IntelliJ IDEA users, import the project. Make sure you select the build.gradle file to import. Then type this in the Terminal when the import is done and the program is closed:

`./gradlew genIntelliJRuns`

On Eclipse, switch your workspace to /eclipse/, which is made after running the above commands in the root directory. In IntelliJ IDEA, you need to edit your run configurations.

If you're using IntelliJ IDEA, go to Run > Edit Configurations. Then change "Use classpath of module" to "<mod_name>_main", where <mod_name> is the name of the mod.