# inline-view-binding
Library to simplify ViewBinding usage and save your life

![ic_inline](https://user-images.githubusercontent.com/32610660/184586181-6d1d4e21-44f8-4d14-b9d5-bcc6434dde1d.png)

[![](https://jitpack.io/v/derysudrajat/inline-view-binding.svg)](https://jitpack.io/#derysudrajat/inline-view-binding)


## Setup

Add this to `build.gradle` (project)

```gradle
allprojects {
  repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
}
```

Add this dependency to `build.grdle` (module) or if you using gradle 7+ put it to `setting.gradle`
```gradle
android {
    // you also need add view binding library as usual
    buildFeatures {
        viewBinding true
    }
}

dependencies {
  implementation 'com.github.derysudrajat:inline-view-binding:1.0.1'
}
```

## How to use
Here how to easy use binding on Activity and Fragment, enjoy 😎✨

### In Activity
You can use the delegate property `by viewBinding(YourLayoutBinding::inflate)` to use this library and voila just it you can use view binding as usual

```kotlin
class MainActivity : AppCompatActivity() {

    // just using delegate by view binding to and inflate your layout like this
    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // ... do your magic here
    } 
}
```

### In Fragment
In Fragment you need to Extend your fragment class with `BindingFragment<YourLayoutBinding>` and you will override `binding` variable
After that you just need to use same delegete property like in Activity `by viewBinding(YourLayoutBinding::inflate)`, and All done 🥳

```kotlin
// extend your fragment class to BindingFragment with your generic layout
class SampleFragment : BindingFragment<FragmentSampleBinding>() {

    // just using delegate by view binding and inflate your layout like this
    override val binding by viewBinding(FragmentSampleBinding::inflate)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // ... do your magic here
    }

}
```

That's it enjoy the library 🥳, give me start if you like this library, ciaaoo 😎✨
