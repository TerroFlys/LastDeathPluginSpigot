# DeathLocation

A simple plugin for Minecraft servers using Spigot that displays the player's last death location.

## Features

-   Displays the player's last death location in chat upon death.
-   Location is displayed with X, Y, and Z coordinates, as well as the world type (Overworld, Nether, End).

## Requirements

-   Minecraft server running Spigot (tested on 1.19.3)
-   Basic knowledge of how to install and run Minecraft plugins
-   Provides a `/lastdeath` command for players to retrieve their last death location.

## Installation

1.  Download the latest version of the DeathLocation plugin from the releases page.
2.  Copy the deathlocation.jar file to the `plugins` folder of your Minecraft server.
3.  Start or restart your server to load the plugin.

## Usage

The plugin will automatically display the player's last death location in chat upon death. The `/lastdeath` command can also be used to retrieve the same information.

By default, both the command and the notification upon death are enabled. To disable either, the following permissions can be used:

-   To disable the `/lastdeath` command, set `lastdeath.command.lastdeath` to false.
-   To disable the notification upon death, set `lastdeath.notify` to false.


## Contributing

If you would like to contribute to the development of the DeathLocation plugin, please feel free to create a pull request or open an issue on the GitHub repository.

## Support

If you have any questions or issues with the DeathLocation plugin, please feel free to open an issue on the GitHub repository.