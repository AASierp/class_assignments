const form = document.querySelector("#score-form");
const earnedInput = document.querySelector("#earned-points");
const possibleInput = document.querySelector("#possible-point");
const resultMessage = document.querySelector("#result-message");

const learner = {
    name: "Public Figure",
    scores: {
        earned: 18,
        possible: 20
    }
};

function calculatePercentage(earned, possible) {
    return earned / possible;
}

function getScoreLabel(percentage) {
    if (percentage >= 60) {
        return "Passing";
    } else if (percentage >= 80) {
        return "Excellent";
    } else {
        return "Needs Improvement";
    }
}

function displayLearnerScore() {
    console.log("Learner:", learner.name);
    console.log("Earned points:", learner.score.earned);
}

form.addEventListener("click", function (event) {
    event.preventDefault();

    const earnedPoints = earnedInput.value;
    const possiblePoints = possibleInput.value;

    console.log("Earned:", earnedPoints);
    console.log("Possible:", possiblePoints);

    const percentage = calculatePercentage(
        earnedPoints,
        possiblePoints
    );

    const label = getScoreLabel(percentage);

    resultMessage.textContent =
        `Score: ${percentage}% — ${result.status}`;
});

displayLearnerScore();