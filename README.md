@Deprecated

该项目已不再维护，请寻找其他开源项目替代，感谢支持！

---
# SettingItem
Items for Setting/PayMethod,etc.

It consists of four parts:

- leftIcon
- leftText
- rightText
- rightIcon

You can combine this according to different modes that fits to you.

![QQ截图20160526163711.png](https://ooo.0o0.ooo/2016/05/26/5746ba4b40cc6.png)
## Gradle
	dependencies {
	    ...
	    compile 'com.chiahaolu:SettingItem:0.0.1'
	}

## Usage
    
	<com.chiahaolu.library.SettingItem
        android:id="@+id/settingItem"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:layout_marginTop="10dp"
        settingitem:leftText="设置"
        settingitem:leftTextSize="32px"
        settingitem:leftTextColor="#666666"
        settingitem:leftTextMarginLeft="16dp"
        settingitem:rightIconResId="@drawable/right_arrow"
        settingitem:rightIconWidth="32px"
        settingitem:rightIconHeight="32px"
        settingitem:rightIconMarginRight="16dp"
        settingitem:rightText="右侧文字"
        settingitem:rightTextSize="32px"
        settingitem:rightTextColor="#666666"
        settingitem:rightTextMarginRight="16dp" />
> I used [AndroidAutoLayout](https://github.com/hongyangAndroid/AndroidAutoLayout) during my work,so you can see px in my code.
> This project is great,you can try it.

## Other Methods
	settingItem.setLeftIcon(R.mipmap.ic_launcher);// change left icon
	settingItem.setLeftText("左侧更改");// change left text
	settingItem.setRightText("右侧更改");// change right text
	settingItem.setRightIcon(R.mipmap.ic_launcher);// change right icon
## Changelog
* 0.0.1
	* Init

## License
SettingItem is licensed under the Apache-2.0 license.

Copyright © 2016, LuJiahao
