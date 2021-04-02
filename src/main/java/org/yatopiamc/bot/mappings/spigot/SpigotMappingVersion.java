package org.yatopiamc.bot.mappings.spigot;

public enum SpigotMappingVersion {
  v1_16_1(
      "1.16.1",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.1-cl.csrg?at=be3371e67489b5a2293306e24420793106baadc1",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.1-members.csrg?at=be3371e67489b5a2293306e24420793106baadc1"),
  v1_16_2(
      "1.16.2",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.2-cl.csrg?at=2589242ccafbffaeb0a36d16e9f59f97ab3411b7",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.2-members.csrg?at=2589242ccafbffaeb0a36d16e9f59f97ab3411b7"),
  v1_16_3(
      "1.16.3",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.3-cl.csrg?at=b2025bdddde79aea004399ec5f3652a1bce56b7a",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.3-members.csrg?at=b2025bdddde79aea004399ec5f3652a1bce56b7a"
  ),
  v1_16_4(
      "1.16.4",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.4-cl.csrg?at=501ea060743c7bba4436878207e4f1232298efce",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.4-members.csrg?at=501ea060743c7bba4436878207e4f1232298efce"
  ),
  v1_16_5(
      "1.16.5",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.5-cl.csrg",
      "https://hub.spigotmc.org/stash/projects/SPIGOT/repos/builddata/raw/mappings/bukkit-1.16.5-members.csrg"
  );
  private final String mcVersion, classMappings, memberMappings;

  SpigotMappingVersion(String mcVersion, String classMappings, String memberMappings) {
    this.mcVersion = mcVersion;
    this.classMappings = classMappings;
    this.memberMappings = memberMappings;
  }

  public static SpigotMappingVersion forMC(String mcVersion) {
    for (SpigotMappingVersion version : SpigotMappingVersion.values()) {
      if (version.getMcVersion().equalsIgnoreCase(mcVersion)) {
        return version;
      }
    }
    return null;
  }

  public String getMcVersion() {
    return mcVersion;
  }

  public String getClassMappings() {
    return classMappings;
  }

  public String getMemberMappings() {
    return memberMappings;
  }
}
