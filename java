<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>JS Drum Kit</title>
        <link rel="stylesheet" href="css/style.css">
        <script src="scripts/drum.js"></script>
    </head>

    <body>
        <div class="keys">
            <div data-key="81" class="key">
                <kbd>Q</kbd>

                <span class="sound">boom</span>
            </div>
            <div data-key="87" class="key">
                <kbd>W</kbd>

                <span class="sound">clap</span>
            </div>
            <div data-key="69" class="key">
                <kbd>E</kbd>

                <span class="sound">hihat</span>
            </div>
            <div data-key="82" class="key">
                <kbd>R</kbd>

                <span class="sound">kick</span>
            </div>
            <div data-key="84" class="key">
                <kbd>T</kbd>

                <span class="sound">openhat</span>
            </div>
            <div data-key="89" class="key">
                <kbd>Y</kbd>

                <span class="sound">ride</span>
            </div>
            <div data-key="85" class="key">
                <kbd>U</kbd>

                <span class="sound">snare</span>
            </div>
            <div data-key="73" class="key">
                <kbd>I</kbd>

                <span class="sound">tink</span>
            </div>
            <div data-key="79" class="key">
                <kbd>O</kbd>

                <span class="sound">tom</span>
            </div>
        </div>

        <audio data-key="81" src="sounds/boom.wav"></audio>
        <audio data-key="87" src="sounds/clap.wav"></audio>
        <audio data-key="69" src="sounds/hihat.wav"></audio>
        <audio data-key="82" src="sounds/kick.wav"></audio>
        <audio data-key="84" src="sounds/openhat.wav"></audio>
        <audio data-key="89" src="sounds/ride.wav"></audio>
        <audio data-key="85" src="sounds/snare.wav"></audio>
        <audio data-key="73" src="sounds/tink.wav"></audio>
        <audio data-key="79" src="sounds/tom.wav"></audio>

        <script type="text/javascript">init();</script>
    </body>
</html>
