class Solution {
public:
    double calEntropy(vector<string>& species)
    {
        unordered_map<string, int> shown;
        double total = species.size();
        for(const string& specie:species)
        {
            ++shown[specie];
        }
        
        double entropy = 0.0;
        for(auto& n:shown)
        {
            double p = n.second / total;
            entropy -= p*log(p)/log(2.0);
        }
        return entropy;
    }
    
    
    double calculateMaxInfoGain(vector<double>& petal_length, vector<string>& species) {
        // Avoid edge case
        if(petal_length.empty() || species.empty()) return 0.0;
        
        int s = petal_length.size();
        double all_entropy = calEntropy(species);
        double information_gain = 0.0;
        
        // Iterate all possible splits
        for(int i = 0; i < s; ++i)
        {
            // Split list
            double split = petal_length[i];
            vector<string> l1;
            vector<string> l2;
            for(int i = 0; i < s; ++i)
            {
                if(petal_length[i] < split)
                {
                    l1.push_back(species[i]);
                }
                else
                {
                    l2.push_back(species[i]);
                }
            }
            
            // Calculate information gain
            double l1_entropy = calEntropy(l1);
            double l2_entropy = calEntropy(l2);
            double p1 = (double)l1.size()/s;
            double p2 = (double)l2.size()/s;
            information_gain = max(information_gain, all_entropy - l1_entropy*p1 - l2_entropy*p2);
        }
    
        return information_gain;
    }
};