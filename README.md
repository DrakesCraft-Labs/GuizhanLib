<p align="center"><img src="banner.svg" alt="GuizhanLib for DrakesCraft" width="100%"></p>

# GuizhanLib for DrakesCraft

Compatibility port of GuizhanLib for Java 21, Paper/Purpur 1.21.11 and the repackaged DrakesCraft Slimefun core.

It provides the common, localization, Minecraft and Slimefun APIs required by maintained DrakesCraft addons. The Chinese-core storage adapter and runtime updater are intentionally excluded because they target a different storage implementation and deployment model.

```bash
./gradlew :guizhanlib-all:publishToMavenLocal -x test
```

Artifact: `com.github.drakescraft_labs:guizhanlib-all:2.5.0-Drake-1.21.11`.

The original project by ybw0014 and its GPL-3.0 license are preserved.
