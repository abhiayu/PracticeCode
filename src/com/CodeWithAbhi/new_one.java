/*
package com.CodeWithAbhi;

class new_one(int n, vector<vector<int>>& trust) {

        //Used to check case 1 (the judge trusts nobody)
        std::unordered_set<int> notJudges;

        //Used to check case 2 (everybody trusts the town judge)
        std::vector<std::unordered_set<int>> personToTrustList(n + 1, std::unordered_set<int>());

        int returnVal = 0;

        for(int i = 0; i < trust.size(); i++)
        {
            notJudges.emplace(trust[i][0]);
            personToTrustList[trust[i][0]].emplace(trust[i][1]);
        }

        if(notJudges.size() == n)
        {
            return -1;
        }
        else
        {
            for(int judge = 1; judge <= n; judge++)
            {
                //Someone satisfies case 1
                if(notJudges.count(judge) == 0)
                {
                    //std::vector<std::unordered_set<int>>::iterator
                    for(int person = 1; person < personToTrustList.size(); person++)
                    {
                        //We've found someone who doesn't trust the judge
                        if(personToTrustList[person].count(judge) == 0 && person != judge)
                        {
                            returnVal = -1;
                        }
                    }

                    if(returnVal == 0)
                    {
                        returnVal = judge;
                    }
                }
            }
        }

        return returnVal;
    }
};

        if (trust.length == 0 && n == 1)
        return 1;
        int[] count = new int[n + 1];
        for (int[] person : trust) {
        count[person[0]]--;
        count[person[1]]++;
        }

        for (int person = 0; person < count.length; person++) {
        if (count[person] == n - 1) return person;
        }
        return -1;*/
