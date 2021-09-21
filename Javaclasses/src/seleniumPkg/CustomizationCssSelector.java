package seleniumPkg;

public class CustomizationCssSelector {

	public static void main(String[] args) {
		// Basic syntax of Css Selector
		//1. tagName[attribute='value']		or [attribute='value']
		
		//if element has id
		//2. #idValue
		
		//use class value
		//3.  .classValue
		
		//if more than more 1 attribute
		//4. tagName[attribute1='value1'][attribute2='value2'][attribute3='value3']
		
		//use parent tag to identify child element
		//5. parentTag>ChildTag[attribute='value']
		
		// use child tag to identify child element from parent Css
		//6. single child->  parentCss>childTag
	    //	 multiple child->  parentCss>childTag:nth-child(position of child tag)
		
		//7. traversing from child element to identify the parent element = not possible in Css selector
		
		//8. using text as an attribute - not possible in Css selector
		
		
		
		
	}

}
