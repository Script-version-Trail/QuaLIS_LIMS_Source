package Configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementTemplateMaster {
	


	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	
 	@FindBy(id="iModuleID_31")
	public static WebElement configurationIcon;
 	
 	

	@FindBy(id="ID_TMD_SampleTypeCombo")
	public static WebElement filterCategory;
	

	@FindBy(id="iFormID_63")
	public static WebElement templateMasterIcon;
	
 	@FindBy(id="ID_TMD_ApprovalSubTypeCombo")
	public static WebElement templateMasterFilterSampleType;
 	
 	
 	
 	
	@FindBy(id="ID_TMD_SampleTypeCombo")
	public static WebElement templateMasterFilterSampleCategory;
/*
	@FindBy(xpath="//*[@id=\"ID_TMD_ApprovalSubTypeCombo\"]")
	public static WebElement templateMasterFilterSampleTypeProduct;
	
	@FindBy(xpath="//*[@id=\"ID_TMD_ApprovalSubTypeCombo\"]/option[2]")
	public static WebElement templateMasterFilterSampleTypeInstrument;

	@FindBy(xpath="//*[@id=\"ID_TMD_ApprovalSubTypeCombo\"]/option[3]")
	public static WebElement templateMasterFilterSampleTypeMaterial;

	@FindBy(xpath="//*[@id=\"ID_TMD_ApprovalSubTypeCombo\"]/option[4]")
	public static WebElement templateMasterFilterSampleTypeStorageCategory;

*/
 

	@FindBy(id="ID_TMD_SampleTypeCombo")
	public static WebElement templateMasterlFilterSampleName;
	
 	@FindBy(id="ID_TMD_MasterConfigFind")
	public static WebElement templateMasterFilterFind;

	



	@FindBy(xpath="//*[@id=\"ID_TMD_Tabs\"]/div[2]/a")
	public static WebElement templateMasterAction;
	
 	@FindBy(id="ID_TMD_TemplateMasterAddbutton")
	public static WebElement templateMasterAdd;

	


	@FindBy(id="iMenuID_1")
	public static WebElement templateMasterEdit;
	
 	@FindBy(id="ID_TMD_TemplateMasterAppbutton")
	public static WebElement templateMasterApprove;

	


	@FindBy(id="iMenuID_1")
	public static WebElement templateMasterDelete;
	
 	@FindBy(id="ID_TMD_versionName")
	public static WebElement templateMasterName;

	


	@FindBy(id="ID_DynamicInput_0")
	public static WebElement firstField;
	
 	@FindBy(id="ID_DynamicButton_0")
	public static WebElement firstAddField;

	


	@FindBy(id="ID_TMD_TemplateMasterADDSubmit")
	public static WebElement templateMasterAddSubmit;
/*	
 	@FindBy(id="iModuleID_31")
	public static WebElement configurationIcon;

	


	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	
 	@FindBy(id="iModuleID_31")
	public static WebElement configurationIcon;

	


	@FindBy(id="iMenuID_1")
	public static WebElement masterIcon;
	
 	@FindBy(id="iModuleID_31")
	public static WebElement configurationIcon;

	
*/
	

}
