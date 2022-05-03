# Coffee Pests Sample App

## How to use the app

This app supports: Live Camera and CameraX enabled live camera.

### Live Camera scenario
It uses the camera preview as input and contains these API workflows: Object detection,visual search and tracking:
* Camera
    * Preview size - Specify the preview size of rear camera manually (Default size is chosen appropriately based on screen size)
    * Enable live viewport - Toggle between blocking camera preview by API processing and result rendering or not
* Object detection / Custom Object Detection
    * Enable multiple objects -- Enable multiple objects to be detected at once
    * Enable classification -- Enable classification for each detected object
- Pests search
  - Enable auto search -- If enabled, search request will be fired automatically once object is detected and confirmed, otherwise a search button will appear to trigger search manually
  - Confirmation time in manual search -- Required time that an manually-detected object needs to be in focus before it is confirmed.
  - Confirmation time in auto search -- Required time that an auto-detected object needs to be in focus before it is confirmed.

### Visual Search

Please note that the visual search functionality in this app will not work since there is no real search backend setup for this repository. However, it should be easy to hook up your  own search service (e.g. [Product Search](https://cloud.google.com/vision/product-search/docs)) by only replacing the [SearchEngine](https://github.com/googlesamples/mlkit/blob/master/android/material-showcase/app/src/main/java/com/google/mlkit/md/productsearch/SearchEngine.kt) class implementation.


## Support

* [Machine learning for mobile developers](https://developers.google.com/ml-kit) - ML Kit brings Google’s machine learning expertise to mobile developers in a powerful and easy-to-use package.
* [Object Detection](https://developers.google.com/ml-kit/vision/object-detection/android) - Detect, track, and classify objects in real time and static images
* [TensorFlow Lite image classification Android example application](https://github.com/tensorflow/examples/tree/master/lite/examples/image_classification/android) - This is an example application for TensorFlow Lite on Android. It uses Image classification to continuously classify whatever it sees from the device's back camera
* [Detect and track objects with ML Kit on Android](https://developers.google.com/ml-kit/vision/object-detection/android) - You can use ML Kit to detect and track objects in successive video frames.
* [Detect, track and classify objects with a custom classification model on Android](https://developers.google.com/ml-kit/vision/object-detection/custom-models/android)  - You can use a custom image classification model to classify the objects that are detected.
* [Codelab](https://codelabs.developers.google.com/mlkit-android-odt#0) - Detect objects in images with ML Kit
* [Object Detection and Tracking with Firebase ML Kit and cameraX](https://medium.com/@cwurthner/object-detection-and-tracking-with-firebase-ml-kit-and-camerax-ml-product-search-part-3-8bd138257101) - Use cameraX to show a preview and Firebase ML Kit to track.
* [Ways of Object Detection on Android](https://www.bombaysoftwares.com/blog/three-ways-of-object-detection-on-android/) - Detect the position of the human body in real time.
* [ML Kit Vision](https://github.com/googlesamples/mlkit/tree/master/android/material-showcase) - Showcase App with Material Design.
* [Documentation](https://developers.google.com/ml-kit/guides)
* [API Reference](https://developers.google.com/ml-kit/reference/android)
* [Stack Overflow](https://stackoverflow.com/questions/tagged/google-mlkit)