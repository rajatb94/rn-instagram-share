# rn-instagram-share
Instagram Media (Video, Image) sharing module (Currently only for Android. iOS support will soon be added).

## Installation
***Enter it in to the terminal being in the project directory.***

```npm install rn-instagram-share --save```

**Now link it using react-native tool**

```react-native link```

## Importing
```js
var InstagramShare = require("rn-instagram-share");
```


## share(Type, FilePath)
You can share Image/Video

**Type**: **"video/\*"** for all video formats & **"image/\*"** for all image formats.
**FilePath**: Absoulte path of the media file stored in your phone.

### example:

```js
var InstagramShare = require("rn-instagram-share");
InstagramShare.share("video/*", "/path/to/file/my_video.mp4");
```

