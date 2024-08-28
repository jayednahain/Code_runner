
//=========================================================================================================================================================================================================================================================
// 22 - closure / hoisting
//https://www.youtube.com/watch?v=eWwge2YpHhc&list=PLu71SKxNbfoBuX3f4EOACle2y-tRC5Q37&index=22
//ex-1 function
// function one(){
//     const fName = "Jayed";
//     function two(){
//         console.log(fName)
//     }
//     console.log(lName); // error
//     two();
// }

// one()

//ex-2 conditions
// if (true){
//     const fName = "jayed";
//     if (userName == "jayed"){
//         const lName = "Jayed nahian";
//         console.log(fName + lName)
//     }
//     console.log(lName); // error
// }
// console.log(fName); // error


// addOne()
// addTwo() // error
//normal declaration
// function addOne(){}
// hold and declaration
// const addTwo = function(){}

//=========================================================================================================================================================================================================================================================

//23
// https://www.youtube.com/watch?v=9ksqBa8_txM&list=PLu71SKxNbfoBuX3f4EOACle2y-tRC5Q37&index=23


function toCamelCase(snakeCaseString) {
    return snakeCaseString.replace(/_([a-z])/g, (match, letter) => letter.toUpperCase());
}


// function convertKeysToCamelCase(obj) {
//     if (Array.isArray(obj)) {
//         return obj.map(item => convertKeysToCamelCase(item));
//     } else if (obj !== null && typeof obj === 'object') {
//         return Object.keys(obj).reduce((acc, key) => {
//             const camelCaseKey = toCamelCase(key);
//             acc[camelCaseKey] = convertKeysToCamelCase(obj[key]);
//             return acc;
//         }, {});
//     }
//     return obj;
// }

function convertKeysAndSetLanguage(response, language) {
    return response.map(issue => {
        const newIssue = {
            mainIssueId: issue.main_issue_id,
            mainIssueName: language === 'bn' ? issue.main_issue_name_bangla : issue.main_issue_name_english,
            subIssues: issue.sub_issues?.map(subIssue => ({

                subIssueId: subIssue.sub_issue_id,
                subIssueName: language === 'bn' ? subIssue.sub_issue_name_bangla : subIssue.sub_issue_name_english

            })) || []
        };

        return newIssue;
    });
}

// const response = [
//     {
//         "main_issue_id": 1,
//         "main_issue_name_english": "Driver Issue",
//         "main_issue_name_bangla": "ড্রাইভারের ইস্যু",
//         "sub_issues": []
//     },
//     {
//         "main_issue_id": 2,
//         "main_issue_name_english": "Truck Issue",
//         "main_issue_name_bangla": "ট্রাকের ইস্যু",
//         "sub_issues": []
//     },
//     {
//         "main_issue_id": 3,
//         "main_issue_name_english": "Customer Care",
//         "main_issue_name_bangla": "হেল্পলাইনের সমস্যা",
//         "sub_issues": []
//     },
//     {
//         "main_issue_id": 5,
//         "main_issue_name_english": "Safety Issue",
//         "main_issue_name_bangla": "নিরাপত্তা ইস্যু",
//         "sub_issues": []
//     },
//     {
//         "main_issue_id": 13,
//         "main_issue_name_english": "Other Issues",
//         "main_issue_name_bangla": "অন্যান্য ইস্যু"
//     }
// ];

const response = [
    {
        "main_issue_id": 1,
        "main_issue_name_english": "Driver Issue",
        "main_issue_name_bangla": "ড্রাইভারের ইস্যু",
        "sub_issues": [
            {
                "sub_issue_id": 7,
                "sub_issue_name_english": "The driver's behavior was not good",
                "sub_issue_name_bangla": "ড্রাইভার বাজে ব্যবহার করেছে"
            },
            {
                "sub_issue_id": 8,
                "sub_issue_name_english": "Driver negotiated the price",
                "sub_issue_name_bangla": "চালক দাম কষা-কষি করলেন"
            },
            {
                "sub_issue_id": 9,
                "sub_issue_name_english": "The driver did not come on time",
                "sub_issue_name_bangla": "ড্রাইভার সময়মত আসে নাই"
            },
            {
                "sub_issue_id": 10,
                "sub_issue_name_english": "Driver asked to cancel the trip",
                "sub_issue_name_bangla": "ড্রাইভার ট্রিপটি বাতিল করতে বলেছে"
            }
        ]
    },
    {
        "main_issue_id": 2,
        "main_issue_name_english": "Truck Issue",
        "main_issue_name_bangla": "ট্রাকের ইস্যু",
        "sub_issues": [
            {
                "sub_issue_id": 4,
                "sub_issue_name_english": "Truck size didn’t match with the mentioned details in app",
                "sub_issue_name_bangla": "গাড়ির সাইজ অ্যাপে উল্লিখিত বিবরণের সাথে মিল নেই"
            },
            {
                "sub_issue_id": 5,
                "sub_issue_name_english": "Truck numbers do not match",
                "sub_issue_name_bangla": "ট্রাকের নম্বর মিল নেই"
            },
            {
                "sub_issue_id": 6,
                "sub_issue_name_english": "The truck was fitness less",
                "sub_issue_name_bangla": "ফিটনেস বিহীন ট্রাক ছিলো"
            }
        ]
    },
    {
        "main_issue_id": 3,
        "main_issue_name_english": "Customer Care",
        "main_issue_name_bangla": "হেল্পলাইনের সমস্যা",
        "sub_issues": [
            {
                "sub_issue_id": 1,
                "sub_issue_name_english": "Couldn’t connect the helpline",
                "sub_issue_name_bangla": "হেল্পলাইনে কল করে পাচ্ছি না"
            },
            {
                "sub_issue_id": 2,
                "sub_issue_name_english": "Customer care wasn’t helpful",
                "sub_issue_name_bangla": "হেল্পলাইন থেকে কোনো সাহায্য পাই নাই"
            }
        ]
    },
    {
        "main_issue_id": 5,
        "main_issue_name_english": "Safety Issue",
        "main_issue_name_bangla": "নিরাপত্তা ইস্যু",
        "sub_issues": [
            {
                "sub_issue_id": 14,
                "sub_issue_name_english": "My Product is lost",
                "sub_issue_name_bangla": "পণ্য হারিয়েছে"
            },
            {
                "sub_issue_id": 15,
                "sub_issue_name_english": "Product damaged",
                "sub_issue_name_bangla": "পণ্য নষ্ট হয়েছে"
            }
        ]
    },
    {
        "main_issue_id": 13,
        "main_issue_name_english": "Other Issues",
        "main_issue_name_bangla": "অন্যান্য ইস্যু"
    }
];

const camelCaseResponse = convertKeysAndSetLanguage(response,"bn");
console.log(JSON.stringify(camelCaseResponse) );
