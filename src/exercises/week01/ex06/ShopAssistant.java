package Ex06;

import Ex03.Tool;

import java.util.List;

public class ShopAssistant {
    public Toolbox findToolbox(String color, List<String> toolNames) {
        Toolbox toolbox = new Toolbox(color);
        for (String toolName : toolNames) {
            Tool tool = new Tool(toolName);
            toolbox.add(tool);
        }
        return toolbox;
    }
}

//    You need the following classes: Tool, Toolbox, ShopAssistant and ToolShopApplication.
//        Reuse the Tool from exercise 3 (don’t copy it, reuse the existing one from the package where it already is).
//        A Toolbox has a color and a list of Tool. Its constructor only asks for the color. Make sure its tools are initialized with an empty collection. It also has the method add to add a Tool to its list and the method getTools that returns the list. It also has the getColor method.

//        A ShopAssistant has no attributes.
//          It has the findToolbox method that receives a list of String representing the names of the tools the customer asks for and returns a Toolbox.
//          In order to create a Toolbox it creates one tool per tool requested adding them to the Toolbox then it returns it.

//        In the ToolShopApplication class main method, create a list of String with three tool names inside, create a ShopAssistant and use it to find a red Toolbox with those three tools inside.
//

