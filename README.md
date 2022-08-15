# BeautifulToast
Customise Beautiful Toast



## Example with a style

1) Define a style in `styles.xml`. All available attributes:
```xml
    <style name="AllStyles">
        <item name="stStrokeWidth">2dp</item>
        <item name="stStrokeColor">#00FFFF</item>
        <item name="stColorBackground">#000</item>
        <item name="stRadius">12dp</item>
        <item name="stFont">@font/roboto_mono_bold</item>
        <item name="stTextSize">18sp</item>
        <item name="stTextColor">#ff0</item>
        <item name="stTextBold">true</item>
        <item name="stSolidBackground">true</item>
        <item name="stIconStart">@mipmap/ic_launcher</item>
        <item name="stIconEnd">@mipmap/ic_launcher</item>
        <item name="stLength">SHORT</item>
    </style>

```

2) Pass your style in the static constructor and call `show();`

```java
            BeautifulToast.makeText(MainActivity.this,"Hello The Bengal Studio, Sayantan Kar here", Toast.LENGTH_LONG,R.style.toaststyle_error).show();
```

## Example with builder pattern
```java
        new BeautifulToast
                .Builder(context)
                .text("Hello world!")
                .textColor(Color.WHITE)
                .backgroundColor(Color.BLUE)
                .show();
```

## Installation

Add it in your root `build.gradle` at the end of repositories:   
```groovy
dependencies {
    implementation 'com.github.karsayantan:BeautifulToast:1.0.0'
}
```

Add the dependency in your `build.gradle`
```groovy
dependencies {
    implementation 'com.github.karsayantan:BeautifulToast:1.0.0'
}
```

## License

    Copyright 2022 The Bengal Studio

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
