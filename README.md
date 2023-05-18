Hello everybody!

I am the developer of different mods for Minecraft, including this one, and I have posted the latest source code here. I hope, that somebody can find this useful as a basis for your own mods.

<h2> Disclaimer </h2>

These sources are not perfect. They contain a lot of repetitive code, so you might see it and think "WTF, Hummel is a crappy coder".

I aimed to create as simple mods as possible with very simple and easy to modify code. 
In general, I succeeded - some of my friends, who are not programmers and do not know Java, are quietly modifying this code for their needs.

In addition, I try to observe the similarity of the codes in the folders so that the "evolution" in the code is visible in each new version of minecraft. 
To make it clear what was replaced by what, and so on.

<h2> Important info </h2>

All the projects can be imported via Eclipse or opened via Intellij IDEA, but 1.12.2 source can't be launched directly from Intellij IDEA. So I recommend to use Eclipse.

Projects are already configured, using needed JDK version and compiler:

* 1.17.1 is using JDK16
* 1.18.2 and higher are using JDK-16
* All the others are using JDK-8 (JDK 1.8)

Compiler versions are the same as JDK.

If you have problems when importing projects, check your JDK's paths.

<h2> Forges folder </h2>

Everybody know, that old Minecraft versions are dying slowly, because their imported files are disappearing from the Internet. 
There is also a problem in new versions: they are using different gradles, and they are to be downloaded and spam a lot.

So I using my own patched versions of Forge. Old versions are fixed and alive, new versions are not spamming. Success!

<h2> Kotlin folder </h2>

Just for fun and interest. Created full copy of usual The Rings of Power mod, but in Kotlin instead of Java. You can use this, if install lib "Forge Kotlin".

<h2> Future (or the past?) </h2>

I have always been attracted to the idea of releasing a mod for every major version of minecraft. Therefore, the mod will be supported on every version for as long as possible.

The mod already exists on version 1.7.10 (the original and native version it was originally developed on), as well as every last release of all major versions from 1.12.2 onwards.

I would really like to release retrospective updates of the mod for versions 1.6.4 and earlier. But I couldn't do anything. Forge of such ancient versions is dead.

If you know how to fix Forge 1.6.4 please let me know - I will be extremely grateful.
