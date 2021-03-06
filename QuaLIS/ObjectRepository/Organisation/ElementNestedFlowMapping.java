package Organisation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementNestedFlowMapping 
{

	@FindBy(xpath = "//*[@id=\"MenuTree\"]/li[1]/a")
	public static WebElement homeIcon;
	
	@FindBy(id = "iMenuID_1")
	public static WebElement masterIcon;

	@FindBy(id = "iModuleID_4")
	public static WebElement organisationManagementIcon;

	@FindBy(id = "iFormID_192")
	public static WebElement nestefFlowMappingIcon;

	@FindBy(xpath= "//*[@id=\"idTabHeader\"]")
	public static WebElement nestefFlowMappingTabIcon;

	
	@FindBy(id = "ID_UM_SiteCombo")
	public static WebElement filterSite;
	
	@FindBy(id = "ID_UM_ApproverSubTypeCombo")
	public static WebElement filterApprovalSubType;
	
	@FindBy(id = "ID_UM_RegistrationTypeCombo")
	public static WebElement filterRegistrationType;
	
	@FindBy(id = "ID_UM_RegistrationSubTypeCombo")
	public static WebElement filterRegistrationSubType;
	
	@FindBy(id = "ID_UM_VersionCombo")
	public static WebElement filterVersion;
	
	@FindBy(id = "ID_UM_AddUser")
	public static WebElement filterFind;
	
	
	@FindBy(id = "ID_UM_filter")
	public static WebElement filterIcon;
	
	@FindBy(xpath = "//*[@id=\"ID_UM_UserMappingFilter\"]/a")
	public static WebElement filterClose;
	
	

	@FindBy(xpath = "//*[@id=\"ID_UM_rightmenu\"]/a")
	public static WebElement nestedFlowMappingAction;
		
	@FindBy(xpath = "//*[@id=\"ID_UM_Tabs\"]/a")
	public static List<WebElement> nestedFlowMappingUserRoleList;
	
	@FindBy(id = "ID_UM_UserMapping_add")
	public static WebElement nestedFlowMappingAdd;
	
	@FindBy(id = "ID_UM_UserMapping_delete")
	public static WebElement nestedFlowMappingDelete;
	
	@FindBy(xpath= "//*[contains(@id,'ID_UM_AvailListContents')]/button")
	public static WebElement nestedFlowMappingViewUsers;
	
	@FindBy(id = "selectall")
	public static WebElement nestedFlowMappingSelectAll;
	
	@FindBy(id = "ID_UM_UserMapadd_submit")
	public static WebElement nestedFlowMappingAddSubmit;
	
	@FindBy(id = "ID_UM_UserMapadd_cancel")
	public static WebElement nestedFlowMappingAddCancel;
		                                     
	@FindBy(xpath = "//*[@id=\"ID_UM_UserMapgetdiv_4\"]/div/div[1]/div[2]/p")
	public static List<WebElement> gridUserNameThirdLevelList;
	
	@FindBy(xpath = "//*[@id=\"ID_UM_UserMapgetdiv_3\"]/div/div[1]/div[2]/p")
	public static List<WebElement> gridUserNameSecondLevelList;
	
	@FindBy(xpath = "//*[@id=\"ID_UM_UserMapgetdiv_2\"]/div/div[1]/div[2]/p")
	public static List<WebElement> gridUserNameFirstLevelList;
	
	
	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_192_4\"]/li")
	public static List<WebElement> userThirdLevelList;
	
	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_192_3\"]/li")
	public static List<WebElement> userSecondLevelList;
	
	@FindBy(xpath = "//*[@id=\"ID_APC_ListDiv_192_2\"]/li")
	public static List<WebElement> userFirstLevelList;
	
}
